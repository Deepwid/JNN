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
//    @Override
    public OutputLayer initLayer(OutputLayer outputLayer) {

        ArrayList<Neuron> listOfNeurons = new ArrayList<Neuron>();
        ArrayList<Double> listOfWeightOut = new ArrayList<Double>();

        for (int i = 0; i < outputLayer.getNumberOfNeuronsInLayer(); i++) {
            Neuron neuron = new Neuron();
            neuron.initNeuron();
            neuron.setListOfWeightOut(listOfWeightOut);

            listOfNeurons.add(neuron);
        }

        outputLayer.setListOfNeurons(listOfNeurons);

        listOfWeightOut = new ArrayList<Double>();

        return outputLayer;
    }

    /**
     * Print the output weights of the layer
     */
//    @Override
    public void printLayer(OutputLayer outputLayer) {

        System.out.println("*** OUTPUT LAYER ***");

        int n = 1;

        for (Neuron neuron: outputLayer.getListOfNeurons()) {
            //
            System.out.print("Position: " + n + " | ") ;
            // ??? why Arrays
            System.out.println(Arrays.deepToString(neuron.getListOfWeightIn().toArray()));
            n++;
        }
    }
}
