package com.jpm.stock.model;

import java.math.BigDecimal;

public class Stock {
	private final String symbol;
	private Type type;
	private BigDecimal lastDiv;
	private BigDecimal fixedDiv;
	private BigDecimal parValue;
	
	public Stock(StockBuilder stockBuilder) {
		this.symbol = stockBuilder.symbol;
		this.type = stockBuilder.type;
		this.lastDiv = stockBuilder.lastDiv;
		this.fixedDiv = stockBuilder.fixedDiv;
		this.parValue = stockBuilder.parValue;		
	}

	public String getSymbol() {
		return symbol;
	}

	public Type getType() {
		return type;
	}

	public BigDecimal getLastDiv() {
		return lastDiv;
	}

	public BigDecimal getFixedDiv() {
		return fixedDiv;
	}

	public BigDecimal getParValue() {
		return parValue;
	}

	public static class StockBuilder{
		private String symbol;
		private Type type;
		private BigDecimal lastDiv;
		private BigDecimal fixedDiv;
		private BigDecimal parValue;
		public String getSymbol() {
			return symbol;
		}
		public StockBuilder setSymbol(String symbol) {
			this.symbol = symbol;
			return this;
		}
		public Type getType() {
			return type;
		}
		public StockBuilder setType(Type type) {
			this.type = type;
			return this;			
		}
		public BigDecimal getLastDiv() {
			return lastDiv;
		}
		public StockBuilder setLastDiv(BigDecimal lastDiv) {
			this.lastDiv = lastDiv;
			return this;			
		}
		public BigDecimal getFixedDiv() {
			return fixedDiv;
		}
		public StockBuilder setFixedDiv(BigDecimal fixedDiv) {
			this.fixedDiv = fixedDiv;
			return this;			
		}
		public BigDecimal getParValue() {
			return parValue;
		}
		public StockBuilder setParValue(BigDecimal parValue) {
			this.parValue = parValue;
			return this;			
		}
		public Stock build(){
			return new Stock(this);
		}		
	}
}