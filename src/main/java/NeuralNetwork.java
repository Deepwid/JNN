import java.util.ArrayList;

/**
 * This class is neural network
 *
 * @author Timur Kashapov
 * @since 17.10.2016
 */
public class NeuralNetwork {

    //
    private InputLayer inputLayer;
    private int numberOfNeuronsInInputLayer = 2;
    //
    private HiddenLayer hiddenLayer;
    private ArrayList<HiddenLayer> listOfHiddenLayer;
    private int numberOfHiddenLayers = 2;
    private int numberOfNeuronsInHiddenLayer = 3;
    //
    private OutputLayer outputLayer;
    private int numberOfNeuronsInOutputLayer = 1;


    /**
     * Initialize the neural network
     */
    public void initNet() {

        /*
         * Create phase
         */

        // Input layer
        inputLayer = new InputLayer();
        inputLayer.setNumberOfNeuronsInLayer(numberOfNeuronsInInputLayer);

        // Hidden layers
        listOfHiddenLayer = new ArrayList<HiddenLayer>();
        for (int i = 0; i < numberOfHiddenLayers; i++) {
            hiddenLayer = new HiddenLayer();
            hiddenLayer.setNumberOfNeuronsInLayer(numberOfNeuronsInHiddenLayer);
            listOfHiddenLayer.add(hiddenLayer);
        }

        // Output layer
        outputLayer = new OutputLayer();
        outputLayer.setNumberOfNeuronsInLayer(numberOfNeuronsInOutputLayer);


        /*
         * Initialize phase
         */
        inputLayer = inputLayer.initLayer(inputLayer);
        listOfHiddenLayer = hiddenLayer.initLayer(hiddenLayer, listOfHiddenLayer, inputLayer, outputLayer);
        outputLayer = outputLayer.initLayer(outputLayer);


    }

    /**
     * Print layers of the neural network
     */
    public void printNet() {

        inputLayer.printLayer(inputLayer);
        System.out.println();
        hiddenLayer.printLayer(listOfHiddenLayer);
        System.out.println();
        outputLayer.printLayer(outputLayer);
    }

}
