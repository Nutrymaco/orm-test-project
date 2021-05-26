package com.nutrymaco.project.records;

import java.util.List;

public record ActorInOrganisationRecord(
	Integer id,
	String name,
	List<MovieInActorRecord> movies,
	CityRecord city){}
