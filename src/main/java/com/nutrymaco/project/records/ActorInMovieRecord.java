package com.nutrymaco.project.records;

public record ActorInMovieRecord(
	Integer id,
	String name,
	OrganisationInActorRecord organisation,
	CityRecord city){}
