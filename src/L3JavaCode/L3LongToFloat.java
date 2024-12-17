package L3JavaCode;

public class L3LongToFloat {
    public static void LongToFloatCastin() {
        long originalLong = Long.MAX_VALUE;
        float castedFloat = (float) originalLong;
        long backToLong = (long) castedFloat;

        System.out.println("Originaler long-Wert: " + originalLong);
        System.out.println("Nach float und zurück gecasteter long-Wert: " + backToLong);

        if (originalLong == backToLong) {
            System.out.println("Der größte darstellbare long-Wert passt in einen float.");
        } else {
            System.out.println("Der größte darstellbare long-Wert passt nicht in einen float (Genauigkeitsverlust).");
        }
    }

    public static void main(String[] args) {
        LongToFloatCastin();
    }
}
