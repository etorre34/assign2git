package FieldTrip;

public class PhotoObservation extends Observation {

	private String imageURL;

	private Double latitude;

	private Double longitude;

	public PhotoObservation(String photo) {

	}

	public PhotoObservation(String photo, Double dLat, Double dLong) {

	}

	@Override
	public String read() {
		return null;
	}

	public String getImageURL() {
		return null;
	}

	private String getLatitude() {
		return null;
	}

	private String getLongitude() {
		return null;
	}

}
