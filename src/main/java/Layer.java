import java.util.ArrayList;

/**
 * This abstract class is represent layers in neural network
 * @author Timur Kashapov
 * @since 17.10.2016
 */
public abstract class Layer {

    private ArrayList<Neuron> listOfNeurons;
    private int numberOfNeuronsInLayer;

    /**
     * Set list of neurons
     * @param listOfNeurons list of neurons in the layer
     */
    public void setListOfNeurons(ArrayList<Neuron> listOfNeurons) {
        this.listOfNeurons = listOfNeurons;
    }

    /**
     * Set number of neurons on the layer
     * @param numberOfNeuronsInLayer number of neurons in the layer
     */
    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
    }

    /**
     * Get list of neurons
     * @return list of neurons
     */
    public ArrayList<Neuron> getListOfNeurons() {
        return listOfNeurons;
    }

    /**
     * Get number of neurons on the layer
     * @return number of the neurons
     */
    public int getNumberOfNeuronsInLayer() {
        return numberOfNeuronsInLayer;
    }





}
