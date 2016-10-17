import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Timur Kashapov
 * @since 17.10.2016
 */
public class InputLayer extends Layer {

    /**
     * Initialize the input layer with pseudo random real numbers
     */
    public InputLayer initLayer(InputLayer inputLayer) {

        ArrayList<Neuron> listOfNeurons = new ArrayList<Neuron>();
        ArrayList<Double> listOfWeights = new ArrayList<Double>();

        for (int i = 0; i < inputLayer.getNumberOfNeuronsInLayer(); i++) {

            Neuron neuron = new Neuron();

            listOfWeights.add(neuron.initNeuron());
            listOfNeurons.add(neuron);

            listOfWeights = new ArrayList<Double>();
        }
        inputLayer.setListOfNeurons(listOfNeurons);
        return inputLayer;
    }

    /**
     * Print the input weights of the layer
     */
    public void printLayer(InputLayer inputLayer) {

        System.out.println("*** INPUT LAYER ***");

        int n = 1;

        for (Neuron neuron: inputLayer.getListOfNeurons()) {
            //
            System.out.print("Position: " + n + " | ") ;
            // ??? why Arrays
            System.out.println(Arrays.deepToString(neuron.getListOfWeightIn().toArray()));
            n++;
        }
    }
}
