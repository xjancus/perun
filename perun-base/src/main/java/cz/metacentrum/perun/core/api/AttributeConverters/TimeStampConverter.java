package cz.metacentrum.perun.core.api.AttributeConverters;

import javax.persistence.AttributeConverter;
import java.sql.Timestamp;

public class TimeStampConverter implements AttributeConverter<String, Timestamp> {

	@Override
	public Timestamp convertToDatabaseColumn(String s) {
		return null;
	}

	@Override
	public String convertToEntityAttribute(Timestamp timestamp) {
		return timestamp.toString();
	}
}
