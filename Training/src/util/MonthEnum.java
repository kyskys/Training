package util;

public enum MonthEnum {
	JANUARY {
		public Number getNumber() {
			return Number.ONE;
		}

		@Override
		public Season getSeason() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	FEBRUARY {

		@Override
		public Number getNumber() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Season getSeason() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	MARCH {

		@Override
		public Number getNumber() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Season getSeason() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	APRIL {

		@Override
		public Number getNumber() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Season getSeason() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	MAY {

		@Override
		public Number getNumber() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Season getSeason() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	JUNE {

		@Override
		public Number getNumber() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Season getSeason() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	JULY {

		@Override
		public Number getNumber() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Season getSeason() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	AUGUST {

		@Override
		public Number getNumber() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Season getSeason() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	SEPTEMBER {

		@Override
		public Number getNumber() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Season getSeason() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	OCTOBER {

		@Override
		public Number getNumber() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Season getSeason() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	NOVEMBER {

		@Override
		public Number getNumber() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Season getSeason() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	DECEMBER {

		@Override
		public Number getNumber() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Season getSeason() {
			// TODO Auto-generated method stub
			return null;
		}

	};
	public abstract Number getNumber();

	public abstract Season getSeason();
}

enum Number {
	ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE
}

enum Season {
	SPRING, SUMMER, AUTUMN, WINTER
}
