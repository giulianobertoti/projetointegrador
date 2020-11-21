let neuralNetwork;
let submitButton;

function setup() {
  noCanvas();

  let nnOptions = {
    dataUrl: 'data/credito.csv',
    inputs: ['idade','divida_mensal', 'divida_total', 'atraso'],
    outputs: ['nivel'],
    task: 'classification',
    debug: true
  };

  neuralNetwork = ml5.neuralNetwork(nnOptions, modelReady)
  submitButton = select('#submit');
  submitButton.mousePressed(classify);
  submitButton.hide();
}

function modelReady() {
  neuralNetwork.normalizeData();
  neuralNetwork.train({ epochs: 50 }, whileTraining, finishedTraining);
}

function whileTraining(epoch, logs) {
  console.log(`Epoch: ${epoch} - loss: ${logs.loss.toFixed(2)}`);
}

function finishedTraining() {
  console.log('done!');
  submitButton.show();
  classify();
}

// TODO: normalize and encode values going into predict?
function classify() {
  let idade = parseInt(select('#idade').value());
  let divida_mensal = parseInt(select('#divida_mensal').value());
  let divida_total = parseInt(select('#divida_total').value());
  let atraso = parseInt(select('#atraso').value());

  let inputs = [idade, divida_mensal, divida_total, atraso];
  neuralNetwork.classify(inputs, gotResults);
}

function gotResults(err, results) {
  if (err) {
    console.error(err);
  } else {
    console.log(results);
    select('#result').html(`prediction: ${results[0].label}`);
  }
}
