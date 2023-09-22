class AppLatLong {
  final double lat;
  final double long;

  const AppLatLong({
    required this.lat,
    required this.long,
  });
}

class EkbLocation extends AppLatLong {
  const EkbLocation({
    super.lat = 55.7522200,
    super.long = 37.6155600,
  });
}
