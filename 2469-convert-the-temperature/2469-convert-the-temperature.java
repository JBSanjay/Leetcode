class Solution {
    public double[] convertTemperature(double celsius) {
        double kel=273.15+celsius;
        double fahr=(celsius*1.8)+32;
        double tmpl[]=new double[2];
        tmpl[0]=kel;
        tmpl[1]=fahr;
        return tmpl;
    }
}