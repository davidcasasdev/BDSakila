package modelo;

import java.sql.Timestamp;
import java.util.Objects;

public class City {

	private int cityId;
	private String city;
	private int countryId;
	private Timestamp lastUpdate;
	
	
	public City(int cityId, String city, int countryId, Timestamp lastUpdate) {
		super();
		this.cityId = cityId;
		this.city = city;
		this.countryId = countryId;
		this.lastUpdate = lastUpdate;
	}


	public int getCityId() {
		return cityId;
	}


	public void setCityId(int cityId) {
		this.cityId = cityId;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getCountryId() {
		return countryId;
	}


	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}


	public Timestamp getLastUpdate() {
		return lastUpdate;
	}


	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}


	@Override
	public String toString() {
		return "cityId: " + cityId + "\ncity: " + city + "\ncountryId: " + countryId + "\nlastUpdate: " + lastUpdate;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cityId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return cityId == other.cityId;
	}
	
	
	
}
