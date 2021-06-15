package neural;

import java.util.ArrayList;
enum TrainingTypesENUM{
    PERCEPTRON,
    ADALINE;
}
enum ActivationFncENUM{
    STEP,
    LINEAR,
    SIGLOG,
    HYPERTAN;
}
public class Training {


    private int epochs;
    private double error;
    private double mse;

    private double calcNewWeight(TrainingTypesENUM trainType,double inputWeightOld,NeuralNet n,double error,double trainSample,double netValue){
        switch (trainType){
            case PERCEPTRON:
                return inputWeightOld+n.getLearningRate()*error*trainSample;
            case ADALINE:
                return inputWeightOld+n.getLearningRate()*error*trainSample*derivativeActivationFnc(n.getLearningRate(),netValue);
            default:
                throw new IllegalArgumentException(trainType+"does not exist in TrainingTypesENUM");
        }
    }

    public NeuralNet train(NeuralNet n){
        ArrayList<Double> inputWeightIn = new ArrayList<Double>();
        int rows= n.getTrainSet().length;
        int cols= n.getTrainSet()[0].length;
        while (this.getEpochs()< n.getMaxEpochs()){
            double estimatedOutput = 0.0;
            double realOutput = 0.0;
            for (int i=0;i<rows;i++){
                double netValue = 0.0;
                for (int j=0;j<cols;j++){
                    inputWeightIn = n.getInputLayer().getListOfNeurons().get(j).getListOfWeightIn();
                    double inputWeight = inputWeightIn.get(0);
                    netValue=netValue+inputWeight*n.getTrainSet()[i][j];
                }
                estimatedOutput = this.activationFnc(n.getActivationFnc(),netValue);
                realOutput = n.getRealOutputSet()[i];
                this.setError(realOutput-estimatedOutput);
                if (Math.abs(this.getError())>n.getTargetError()){
                    InputLayer inputLayer=new InputLayer();
                    inputLayer.setListOfNeurons(this.teachNeuronsOfLayer(cols,i,n,netValue));
                    n.setInputLayer(inputLayer);
                }
            }
            this.setMse(Math.pow(realOutput-estimatedOutput,2.0));
            n.getListOfMSE().add(this.getMse());
            this.setEpochs(this.getEpochs()+1);
        }
        n.setTrainingError(this.getError());
        return n;
    }

    private double derivativeActivationFnc(double learningRate, double netValue) {
        return 0;
    }

    public ArrayList<Neuron> teachNeuronsOfLayer(int numberOfInputNeuron,int line,NeuralNet n,double nteValue){
        return null;
    }

    public double activationFnc(ActivationFncENUM fnc,double value){
        return value;
    }

    private double fncStep(double v){
        return v;
    }

    private double fncLiner(double v){
        return v;
    }

    private double fncSigLog(double v){
        return v;
    }

    private double fncHyperTan(double v){
        return v;
    }

    private double derivativeFncHyperTan(double v){
        return v;
    }

    public void printTrainedNetResult(NeuralNet trainedNet){}

    public int getEpochs() {
        return epochs;
    }

    public void setEpochs(int epochs) {
        this.epochs = epochs;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    public double getMse() {
        return mse;
    }

    public void setMse(double mse) {
        this.mse = mse;
    }
}
