package neural;

import java.util.ArrayList;

public class InputLayer {

    private ArrayList<Neuron> listOfNeurons;

    public InputLayer initLayer(InputLayer inputLayer){
        return null;
    }

    public void printLayer(InputLayer inputLayer){}

    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer){}

    public ArrayList<Neuron> getListOfNeurons() {
        return listOfNeurons;
    }

    public void setListOfNeurons(ArrayList<Neuron> listOfNeurons) {
        this.listOfNeurons = listOfNeurons;
    }
}
