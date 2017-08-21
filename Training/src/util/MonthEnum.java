package util;

public enum MonthEnum {
	JANUARY {
		public Number getNumber() {
			return Number.ONE;
		}

		@Override
		public Season getSeason() {
			return Season.WINTER;
		}

	},
	FEBRUARY {

		@Override
		public Number getNumber() {
			return Number.TWO;
		}

		@Override
		public Season getSeason() {
			return Season.WINTER;
		}

	},
	MARCH {

		@Override
		public Number getNumber() {
			return Number.THREE;
		}

		@Override
		public Season getSeason() {
			return Season.SPRING;
		}

	},
	APRIL {

		@Override
		public Number getNumber() {
			return Number.FOUR;
		}

		@Override
		public Season getSeason() {
			return Season.SPRING;
		}

	},
	MAY {

		@Override
		public Number getNumber() {
			return Number.FIVE;
		}

		@Override
		public Season getSeason() {
			return Season.SPRING;
		}

	},
	JUNE {

		@Override
		public Number getNumber() {
			return Number.SIX;
		}

		@Override
		public Season getSeason() {
			return Season.SUMMER;
		}

	},
	JULY {

		@Override
		public Number getNumber() {
			return Number.SEVEN;
		}

		@Override
		public Season getSeason() {
			return Season.SUMMER;
		}

	},
	AUGUST {

		@Override
		public Number getNumber() {
			return Number.EIGHT;
		}

		@Override
		public Season getSeason() {
			return Season.SUMMER;
		}

	},
	SEPTEMBER {

		@Override
		public Number getNumber() {
			return Number.NINE;
		}

		@Override
		public Season getSeason() {
			return Season.AUTUMN;
		}

	},
	OCTOBER {

		@Override
		public Number getNumber() {
			return Number.TEN;
		}

		@Override
		public Season getSeason() {
			return Season.AUTUMN;
		}

	},
	NOVEMBER {

		@Override
		public Number getNumber() {
			return Number.ELEVEN;
		}

		@Override
		public Season getSeason() {
			return Season.AUTUMN;
		}

	},
	DECEMBER {

		@Override
		public Number getNumber() {
			return Number.TWELVE;
		}

		@Override
		public Season getSeason() {
			return Season.WINTER;
		}

	};
	public abstract Number getNumber();

	public abstract Season getSeason();
}

enum Number {
	ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE;
}

enum Season {
	SPRING, SUMMER, AUTUMN, WINTER;
}
