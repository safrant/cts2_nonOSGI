package edu.mayo.cts2.framework.service.core.config.option;

public interface Option {
	
	public enum OptionType {STRING, BOOLEAN, PASSWORD}
	
	public String getOptionName();
	
	public String getOptionValueAsString();
	
	public OptionType getOptionType();

}
