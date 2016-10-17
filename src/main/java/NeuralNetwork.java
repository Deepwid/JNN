import java.util.ArrayList;

/**
 * This class is neural network
 * @author Timur Kashapov
 * @since 17.10.2016
 */
public class NeuralNetwork {

    private int countOfNeurons;

    private InputLayer inputLayer;
    private OutputLayer outputLayer;

    private ArrayList<HiddenLayer > hiddenLayerArrayList;
    private final int numberOfHiddenLayers = 2;


    /**
     * Initialize the neural network
     */
    public void initNet() {

        inputLayer = new InputLayer();
        inputLayer.initLayer(inputLayer);

        outputLayer = new OutputLayer();
        outputLayer.initLayer(outputLayer);

        for (int i = 0; i < numberOfHiddenLayers; i++) {
            HiddenLayer hiddenLayer = new HiddenLayer();
            hiddenLayerArrayList.add(hiddenLayer);
        }

        HiddenLayer hiddenLayer = new HiddenLayer();
        hiddenLayer.initLayer(hiddenLayer ,hiddenLayerArrayList, inputLayer, outputLayer);

    }

    /**
     * Print layers of the neural network
     */
    public void printNet() {

        inputLayer.printLayer(inputLayer);
    }

}
