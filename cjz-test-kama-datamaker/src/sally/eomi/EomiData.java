package sally.eomi;

import sally.Data;

public class EomiData extends Data {

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EomiData [getName()=");
		builder.append(getName());
		builder.append(", getFrame()=");
		builder.append(getFrame());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
