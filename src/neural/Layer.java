package neural;

import java.util.ArrayList;

public class Layer {

    private ArrayList<Neuron> listOfNeurons;  //
    private int numberOfNeuronsInLayer; //神经元数量

    public ArrayList<Neuron> getListOfNeurons() {
        return listOfNeurons;
    }

    public int getNumberOfNeuronsInLayer() {
        return numberOfNeuronsInLayer;
    }

    public void setListOfNeurons(ArrayList<Neuron> listOfNeurons) {
        this.listOfNeurons = listOfNeurons;
    }

    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
    }
}
