package magicbees2.api.apiculture;

public interface ITemplate {
	
	/**
	 * Get the speed details of the bee
	 * @return
	 */
	String getSpeed();
	
	/**
	 * Get the lifespan details of the bee
	 * @return
	 */
	String getLifespan();
	
	/**
	 * Get the fertility details of the bee
	 * @return
	 */
	String getFertility();
	
	/**
	 * Get the temperature the bee will operate in
	 * @return
	 */
	String getTemperatureTolerance();
	
	/**
	 * Determine if the bee can work at night
	 * @return
	 */
	String getNocturnal();
	
	/**
	 * Get the humidity the bee will operate in
	 * @return
	 */
	String getHumidityTolerance();
	
	/**
	 * Determine if the bee can fly while it's raining outside
	 * @return
	 */
	String getTolerant();

	/**
	 * Determine if the bee can work underground
	 * @return
	 */
	String getCaveDwelling();
	
	/**
	 * Get what type of flower(s) the bee will use
	 * @return
	 */
	String getFlowerProvider();
	
	/**
	 * Get the flowering details of the bee
	 * @return
	 */
	String getFlowering();
		
	/**
	 * Get the territory details of the bee
	 * @return
	 */
	String getTerritory();

	/**
	 * Get the effect details of the bee
	 * @return
	 */
	String getEffect();

}
