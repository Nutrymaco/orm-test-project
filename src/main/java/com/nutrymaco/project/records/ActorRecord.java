package com.nutrymaco.project.records;

import java.util.List;

public record ActorRecord(
	Integer id,
	String name,
	List<MovieInActorRecord> movies,
	OrganisationInActorRecord organisation,
	CityRecord city){}
