import java.util.Comparator;

public class Document implements Comparable<Document> {

    static class SumComparatorAsc implements Comparator<Document> {
        @Override
        public int compare(Document doc1, Document doc2) {
            return doc1.sum - doc2.sum;
        }
    }

    int number;
    int sum;

    public Document(int number, int sum) {
        this.number = number;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Document{" +
                "number=" + number +
                ", sum=" + sum +
                '}';
    }

    @Override
    public int compareTo(Document doc) {
        if(this.number > doc.number) return 1;
        if(this.number == doc.number) return 0;
        if(this.number < doc.number) return -1;

        return 0;
    }
}
