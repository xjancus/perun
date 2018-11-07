package cz.metacentrum.perun.core.api.AttributeConverters;

import cz.metacentrum.perun.core.api.Status;

import javax.persistence.AttributeConverter;

public class MemberStatusConverter implements AttributeConverter<Status, Character> {
	@Override
	public Character convertToDatabaseColumn(Status status) {
		Character stat = '0';
		switch (status) {
			case VALID: 	stat = '0';
							break;

			case INVALID: 	stat =  '1';
							break;

			case SUSPENDED:	stat = '2';
							break;

			case EXPIRED:	stat = '3';
							break;

			case DISABLED:	stat = '4';
							break;
		}
		return stat;
	}

	@Override
	public Status convertToEntityAttribute(Character character) {
		return Status.getStatus(Character.getNumericValue(character));
	}
}
