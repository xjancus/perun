package cz.metacentrum.perun.core.api.AttributeConverters;

import javax.persistence.AttributeConverter;

public class UserSpecificTypeConverter implements AttributeConverter<Boolean, Character> {

	@Override
	public Character convertToDatabaseColumn(Boolean isSpecificType) {
		return isSpecificType ? '1':'0';
	}

	@Override
	public Boolean convertToEntityAttribute(Character character) {
		return character.equals('1');
	}
}
