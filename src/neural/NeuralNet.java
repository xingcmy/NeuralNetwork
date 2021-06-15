package neural;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NeuralNet {
    private InputLayer inputLayer;
    private HiddenLayer hiddenLayer;
    private ArrayList<HiddenLayer> listOfHiddenLayer;
    private OutputLayer outputLayer;
    private int numberOfHiddenLayers;
    private double[][] trainSet;
    private double[] realOutputSet;
    private int maxEpochs;
    private double learningRate;
    private double targetError;
    private  double trainingError;
    private TrainingTypesENUM trainType;
    private ActivationFncENUM activationFnc;
    private ArrayList<Double> listOfMSE = new ArrayList<Double>();

    public NeuralNet trainNet(NeuralNet n){
        return new NeuralNet();
    }

    public void printTrainedNetResult(NeuralNet n){

    }

    public void initNet(){}

    public void printNet(){}

    public HiddenLayer getHiddenLayer() {
        return hiddenLayer;
    }

    public InputLayer getInputLayer() {
        return inputLayer;
    }

    public ArrayList<HiddenLayer> getListOfHiddenLayer() {
        return listOfHiddenLayer;
    }

    public int getNumberOfHiddenLayers() {
        return numberOfHiddenLayers;
    }

    public OutputLayer getOutputLayer() {
        return outputLayer;
    }

    public void setHiddenLayer(HiddenLayer hiddenLayer) {
        this.hiddenLayer = hiddenLayer;
    }

    public void setInputLayer(InputLayer inputLayer) {
        this.inputLayer = inputLayer;
    }

    public void setListOfHiddenLayer(ArrayList<HiddenLayer> listOfHiddenLayer) {
        this.listOfHiddenLayer = listOfHiddenLayer;
    }

    public void setNumberOfHiddenLayers(int numberOfHiddenLayers) {
        this.numberOfHiddenLayers = numberOfHiddenLayers;
    }

    public void setOutputLayer(OutputLayer outputLayer) {
        this.outputLayer = outputLayer;
    }

    public double getLearningRate(){
        return learningRate;
    }

    public double[][] getTrainSet() {
        return trainSet;
    }

    public void setTrainSet(double[][] trainSet) {
        this.trainSet = trainSet;
    }

    public double[] getRealOutputSet() {
        return realOutputSet;
    }

    public void setRealOutputSet(double[] realOutputSet) {
        this.realOutputSet = realOutputSet;
    }

    public int getMaxEpochs() {
        return maxEpochs;
    }

    public void setMaxEpochs(int maxEpochs) {
        this.maxEpochs = maxEpochs;
    }

    public double getTargetError() {
        return targetError;
    }

    public void setTargetError(double targetError) {
        this.targetError = targetError;
    }

    public void setLearningRate(double learningRate) {
        this.learningRate = learningRate;
    }

    public double getTrainingError() {
        return trainingError;
    }

    public void setTrainingError(double trainingError) {
        this.trainingError = trainingError;
    }

    public ActivationFncENUM getActivationFnc() {
        return activationFnc;
    }

    public void setActivationFnc(ActivationFncENUM activationFnc) {
        this.activationFnc = activationFnc;
    }

    public TrainingTypesENUM getTrainType(){
        return trainType;
    }

    public void setTrainType(TrainingTypesENUM trainType) {
        this.trainType = trainType;
    }

    public ArrayList<Double> getListOfMSE() {
        return listOfMSE;
    }

    public void setListOfMSE(ArrayList<Double> listOfMSE) {
        this.listOfMSE = listOfMSE;
    }
}
