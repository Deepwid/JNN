import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Timur Kashapov
 * @since 17.10.2016
 */
public class OutputLayer extends Layer {

    /**
     * Initialize weight of the output layer
     */
    public OutputLayer initLayer(OutputLayer outputLayer) {

        ArrayList<Neuron> listOfNeurons = new ArrayList<Neuron>();
        ArrayList<Double> listOfWeightOut = new ArrayList<Double>();

        for (int i = 0; i < outputLayer.getNumberOfNeuronsInLayer(); i++) {
            Neuron neuron = new Neuron();

            listOfWeightOut.add(neuron.initNeuron());
            neuron.setListOfWeightOut(listOfWeightOut);
            listOfNeurons.add(neuron);

            listOfWeightOut = new ArrayList<Double>();
        }
        outputLayer.setListOfNeurons(listOfNeurons);
        return outputLayer;
    }

    /**
     * Print the output weights of the layer
     */
    public void printLayer(OutputLayer outputLayer) {

        System.out.println("*** OUTPUT LAYER ***");

        int n = 1;

        for (Neuron neuron: outputLayer.getListOfNeurons()) {
            System.out.print("Neuron # " + n + " | ") ;
            System.out.println(Arrays.deepToString(neuron.getListOfWeightOut().toArray()));
            n++;
        }
    }
}
