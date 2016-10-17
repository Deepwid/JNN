import java.util.ArrayList;
import java.util.Random;

/**
 * This basic class of neuron model
 * @author Timur Kashapov
 * @since 17.10.2016
 */
public class Neuron {

    // An ArrayList real numbers that represent the list of input weights values
    private ArrayList<Double> listOfWeightIn;

    // // An ArrayList real numbers that represent the list of output weights values
    private ArrayList<Double> getListOfWeightOut;

    /**
     * Initialize listOfWeightIn and listOfWeightOut function with a pseudo random real numbers
     */
    public double initNeuron() {
        Random random = new Random();

        return Math.E;
    }

    /**
     * Set list
     * @param listOfWeightIn list of input weights
     */
    public void setListOfWeightIn(ArrayList<Double> listOfWeightIn) {
        this.listOfWeightIn = listOfWeightIn;
    }

    /**
     * Set list
     * @param getListOfWeightOut list of output weights
     */
    public void setGetListOfWeightOut(ArrayList<Double> getListOfWeightOut) {
        this.getListOfWeightOut = getListOfWeightOut;
    }

    /**
     * Get list of input weights
     * @return list
     */
    public  ArrayList<Double> getListOfWeightIn() {
        return listOfWeightIn;
    }

    /**
     * Get list of output weights
     * @return list
     */
    public ArrayList<Double> getGetListOfWeightOut() {
        return getListOfWeightOut;
    }
}
