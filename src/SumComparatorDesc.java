import java.util.Comparator;

public class SumComparatorDesc implements Comparator<Document> {
    @Override
    public int compare(Document doc1, Document doc2) {
        return doc2.sum - doc1.sum;
    }
}
