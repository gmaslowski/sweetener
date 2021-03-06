package pl.jsolve.sweetener.criteria;

public interface Restriction {

    public enum RestrictionLevel {
	HIGH(3), MEDIUM(2), LOW(1);

	public Integer level;

	RestrictionLevel(int level) {
	    this.level = level;
	}
    }

    public RestrictionLevel getRestrictionLevel();

    public String getFieldName();

    public boolean satisfies(Object fieldName);
}
