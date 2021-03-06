package com.atmosware.cleanarchwithcqrs.application.features.account.commands.create;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateAccountTypeCommand {

	@TargetAggregateIdentifier
	private String accountTypeId;

	private String accountName;

	private double price;

	private String description;
	//sürece dahil edeceği alanlar

}
