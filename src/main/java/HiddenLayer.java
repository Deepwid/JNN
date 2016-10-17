import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Timur Kashapov
 * @since 17.10.2016
 */
public class HiddenLayer extends Layer {

    /**
     * Initialize weights of the hidden layers
     *
     * @param hiddenLayer        instance of hidden layer
     * @param listOfHiddenLayers list of hidden layer
     * @param inputLayer         instance of input layer
     * @param outputLayer        instance of output layer
     * @return list of hidden layers
     */
//    @Override
    public ArrayList<HiddenLayer> initLayer(HiddenLayer hiddenLayer, ArrayList<HiddenLayer> listOfHiddenLayers, InputLayer inputLayer, OutputLayer outputLayer) {

        ArrayList<Neuron> listOfNeurons = new ArrayList<Neuron>();
        ArrayList<Double> listOfWeightIn = new ArrayList<Double>();
        ArrayList<Double> listOfWeightOut = new ArrayList<Double>();

        int numberOfHiddenLayers = listOfHiddenLayers.size();

        for (int i = 0; i < numberOfHiddenLayers; i++) {

            for (int j = 0; j < hiddenLayer.getNumberOfNeuronsInLayer(); j++) {

                Neuron neuron = new Neuron();

                int limitIn;
                int limitOut;

                if (i == 0) {
                    limitIn = inputLayer.getNumberOfNeuronsInLayer();
                    if (numberOfHiddenLayers > 1) {
                        limitOut = listOfHiddenLayers.get(i + 1).getNumberOfNeuronsInLayer();
                    } else {
                        /*
                         * ??? Why listOfHiddenLayers.get(i).getNumberOfNeuronsInLayer() SHOULD BE THE SAME => outputLayer.getNumberOfNeuronsInLayer() ???
                         */
                        limitOut = listOfHiddenLayers.get(i).getNumberOfNeuronsInLayer();
                    }

                } else if (i == numberOfHiddenLayers - 1) {
                    limitIn = listOfHiddenLayers.get(i - 1).getNumberOfNeuronsInLayer();
                    limitOut = outputLayer.getNumberOfNeuronsInLayer();
                } else {
                    limitIn = listOfHiddenLayers.get(i - 1).getNumberOfNeuronsInLayer();
                    limitOut = listOfHiddenLayers.get(i + 1).getNumberOfNeuronsInLayer();
                }

                for (int k = 0; k < limitIn; k++) {
                    listOfWeightIn.add(neuron.initNeuron());
                } //  for (int k = 0; k < limitIn; k++)

                for (int k = 0; k < limitOut; k++) {
                    listOfWeightOut.add(neuron.initNeuron());
                } // for (int k = 0; k < limitOut; k++)

                neuron.setListOfWeightIn(listOfWeightIn);
                neuron.setListOfWeightOut(listOfWeightOut);

                listOfNeurons.add(neuron);

                listOfWeightIn = new ArrayList<Double>();
                listOfWeightOut = new ArrayList<Double>();

            } //  for (int j = 0; j < hiddenLayer.getNumberOfNeuronsInLayer(); j++)

            listOfHiddenLayers.get(i).setListOfNeurons(listOfNeurons);
            listOfNeurons = new ArrayList<Neuron>();

        } //  for (int i = 0; i < numberOfHiddenLayers; i++)

        return listOfHiddenLayers;
    }

    /**
     * Print the weights of the layers
     *
     * @param listOfHiddenLayer list of weights in hidden layers
     */
//    @Override
    public void printLayer(ArrayList<HiddenLayer> listOfHiddenLayer) {

        System.out.println("*** HIDDEN LAYER ***");

        int h = 1;

        for (HiddenLayer hiddenLayer : listOfHiddenLayer) {

            System.out.println();
            System.out.println("Hidden layer # " + h);

            int n = 1;
            for (Neuron neuron : hiddenLayer.getListOfNeurons()) {
                System.out.println("Neuron # " + n);
                System.out.println("Input weights: " + Arrays.deepToString(neuron.getListOfWeightIn().toArray()));
                System.out.println("Out weights: " + Arrays.deepToString(neuron.getListOfWeightOut().toArray()));
                n++;
            }
            h++;
        }
    }
}
