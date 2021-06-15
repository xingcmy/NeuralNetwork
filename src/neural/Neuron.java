package neural;

import java.util.ArrayList;

public class Neuron {
    private ArrayList<Double> listOfWeightIn; //输入权值集合
    private ArrayList<Double> listOfWeightOut; //输出权值集合

    public double initNeuron(){
        return 1;
    }

    public ArrayList<Double> getListOfWeightIn() {
        return listOfWeightIn;
    }

    public ArrayList<Double> getListOfWeightOut() {
        return listOfWeightOut;
    }

    public void setListOfWeightIn(ArrayList<Double> listOfWeightIn) {
        this.listOfWeightIn = listOfWeightIn;
    }

    public void setListOfWeightOut(ArrayList<Double> listOfWeightOut) {
        this.listOfWeightOut = listOfWeightOut;
    }
}
