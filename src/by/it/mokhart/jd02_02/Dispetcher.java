package by.it.mokhart.jd02_02;

public class Dispetcher {

    private static final Object countMonitor = new Object();

    private static final Integer planCount = 100;
    private static volatile int countBuyerInShop = 0;
    private static volatile int countBuyerComplete = 0;

    static void addBuyer() {
        synchronized (countMonitor) {
            countBuyerInShop++;
        }
    }

    static void completeBuyer() {
        synchronized (countMonitor) {
            countBuyerInShop--;
            countBuyerComplete++;
        }
    }

    static boolean openedMarket() {
        return (countBuyerComplete < planCount);
    }

    static boolean planComplete() {
        return (countBuyerComplete + countBuyerInShop) >= planCount;
    }
}
