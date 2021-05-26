package com.nutrymaco.project.fields;
import com.nutrymaco.orm.schema.lang.EntityFactory;
import com.nutrymaco.orm.schema.lang.Entity;
import com.nutrymaco.orm.schema.lang.FieldRef;

import com.nutrymaco.project.model.Organisation;

public class _OrganisationInActor{
	private final String path;
	public static final Entity ORGANISATION_ENTITY = EntityFactory.from(Organisation.class);
	public final FieldRef<Integer> ID;
	public final FieldRef<String> NAME;
	public _CityInOrganisation CITY = _CityInOrganisation.CITY.from("ORGANISATION");
	public static final _OrganisationInActor ORGANISATION  = new _OrganisationInActor("ORGANISATION");
	_OrganisationInActor(String path) {
		ID = new FieldRef <Integer>(ORGANISATION_ENTITY.getFieldByName("id"), path);
		NAME = new FieldRef <String>(ORGANISATION_ENTITY.getFieldByName("name"), path);
		this.path = path;
	}
	_OrganisationInActor from(String add) {
		var copy = new _OrganisationInActor(add + "." + path);
		copy.CITY = CITY.from(add);
		return copy;
	}
}
