package chain;

import java.util.List;

public class FilterChainImpl implements FilterChain {

	private final List<Filter> filters;

	private final int filterSize;

	protected int pos = 0;

	public FilterChainImpl(List<Filter> filters) {
		this.filters = filters;
		this.filterSize = filters.size();
	}

	@Override
	public int getFilterSize() {
		return 0;
	}

	@Override
	public boolean doSomething(Object obj) {
		if (this.pos < filterSize) {
			return nextFilter().doSomething(this,obj);
		}
		System.out.println("really  worked:---"+obj+"---do something!!!");
		return true;
	}

	private Filter nextFilter() {
		Filter filter = getFilters().get(pos++);
		return filter;
	}

	public List<Filter> getFilters() {
		return filters;
	}

}
