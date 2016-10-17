import java.util.ArrayList;

/**
 * This abstract class is represent layers in neural network
 * @author Timur Kashapov
 * @since 17.10.2016
 */
public abstract class Layer {


    private ArrayList<Neuron> listOfNeurons;

    private int numberOfNeuronsInLayer;

    /*
    public abstract void initLayer();

    public abstract void printLayer();
    */

    /**
     * Set list of neurons
     * @param listOfNeurons
     */
    public void setListOfNeurons(ArrayList<Neuron> listOfNeurons) {
        this.listOfNeurons = listOfNeurons;
    }

    /**
     * Set number of neurons on the layer
     * @param numberOfNeuronsInLayer
     */
    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
    }

    /**
     * Get list of neurons
     * @return
     */
    public ArrayList<Neuron> getListOfNeurons() {
        return listOfNeurons;
    }

    /**
     * Get number of neurons on the layer
     * @return
     */
    public int getNumberOfNeuronsInLayer() {
        return numberOfNeuronsInLayer;
    }





}
