package space.harbour.java.hw2;

public class EstimateSize {

    private static final Runtime r = Runtime.getRuntime();
    private static final Object o = new Object();

    private static long usedMemory() {
        return r.totalMemory() - r.freeMemory();
    }

    private static long getObjectSize() throws InterruptedException{
        System.gc();
        Thread.sleep(10);
        long beforeDeclaration = usedMemory();
        Object obj = new Object();
        long afterDeclaration = usedMemory();
        return afterDeclaration - beforeDeclaration;
    }

    private static long getReferenceSize() throws InterruptedException{
        System.gc();
        Thread.sleep(10);
        long beforeDeclaration = usedMemory();
        Object obj = o;
        long afterDeclaration = usedMemory();
        return afterDeclaration - beforeDeclaration;
    }

    private static long getIntegerSize() throws InterruptedException{
        System.gc();
        Thread.sleep(10);
        long beforeDeclaration = usedMemory();
        Integer number = new Integer(1);
        long afterDeclaration = usedMemory();
        return afterDeclaration - beforeDeclaration;
    }

    private static long getStringSize() throws InterruptedException{
        System.gc();
        Thread.sleep(10);
        long beforeDeclaration = usedMemory();
        String word = "word";
        long afterDeclaration = usedMemory();
        return afterDeclaration - beforeDeclaration;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.printf("Integer Size: %d\n", getIntegerSize());
        System.out.printf("String Size: %d\n", getStringSize());
        System.out.printf("Object Size: %d\n", getObjectSize());
        System.out.printf("Reference Size: %d\n", getReferenceSize());
    }
}
