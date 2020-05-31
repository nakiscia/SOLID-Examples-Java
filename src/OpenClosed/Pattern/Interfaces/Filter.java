package OpenClosed.Pattern.Interfaces;

import java.util.List;
import java.util.stream.Stream;

// We create a new Filter interface for generalization..
public interface Filter<T> {
  Stream<T> filter(List<T> items, Spesification<T> spec);
}
