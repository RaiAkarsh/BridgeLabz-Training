public class Utility {

    public boolean validateTransportId(String transportId) {
        if (!transportId.matches("RTS\\d{3}[A-Z]")) {
            System.out.println("Transport id " + transportId + " is invalid");
            return false;
        }
        return true;
    }

    public GoodsTransport parseDetails(String input) {
        String[] data = input.split(":");

        if (data[3].equalsIgnoreCase("BrickTransport")) {
            return new BrickTransport(data[0], data[1], Integer.parseInt(data[2]),
                    Float.parseFloat(data[4]), Integer.parseInt(data[5]), Float.parseFloat(data[6]));
        } else {
            return new TimberTransport(data[0], data[1], Integer.parseInt(data[2]),
                    Float.parseFloat(data[4]), Float.parseFloat(data[5]),
                    data[6], Float.parseFloat(data[7]));
        }
    }

    public String findObjectType(GoodsTransport gt) {
        return gt instanceof TimberTransport ? "TimberTransport" : "BrickTransport";
    }
}