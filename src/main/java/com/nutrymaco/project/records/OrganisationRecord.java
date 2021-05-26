package com.nutrymaco.project.records;

import java.util.List;

public record OrganisationRecord(
	Integer id,
	String name,
	List<ActorInOrganisationRecord> actors,
	CityRecord city){}
