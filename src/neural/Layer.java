package neural;

import java.util.ArrayList;

public class Layer {

    private ArrayList<Neuron> listOfNeuron;  //
    private int numberOfNeuronsInLayer; //神经元数量

    public ArrayList<Neuron> getListOfNeuron() {
        return listOfNeuron;
    }

    public int getNumberOfNeuronsInLayer() {
        return numberOfNeuronsInLayer;
    }

    public void setListOfNeuron(ArrayList<Neuron> listOfNeuron) {
        this.listOfNeuron = listOfNeuron;
    }

    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
    }
}
