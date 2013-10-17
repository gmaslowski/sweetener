package pl.jsolve.sweetener.converter.collectionTo;

import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Set;

public class CollectionToSetConverter extends CollectionToAbstractConverter<Set<?>> {

	@Override
	public Set<?> convert(AbstractCollection<?> source) {
		return new HashSet<>(source);
	}
}