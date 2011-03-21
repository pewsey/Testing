package org.eaves.robot;

public enum Direction {
    
    NORTH {
        @Override 
        public Direction left() {
            return WEST;
        }

        @Override
        public Direction right() {
            return EAST;
        }

		@Override
		public int xDeltaForward() {
			return 0;
		}

		@Override
		public int yDeltaForward() {
			return 1;
		}
    },
    
    EAST {
        @Override
        public Direction left() {
            return NORTH;
        }

        @Override
        public Direction right() {
            return SOUTH;
        }

		@Override
		public int xDeltaForward() {
			return 1;
		}

		@Override
		public int yDeltaForward() {
			return 0;
		}
    },
    
    SOUTH {
        @Override
        public Direction left() {
            return EAST;
        }

        @Override
        public Direction right() {
            return WEST;
        }

		@Override
		public int xDeltaForward() {
			return 0;
		}

		@Override
		public int yDeltaForward() {
			return -1;
		}
    },
    
    WEST {
        @Override
        public Direction left() {
            return SOUTH;
        }

        @Override
        public Direction right() {
            return NORTH;
        }

		@Override
		public int xDeltaForward() {
			return -1;
		}

		@Override
		public int yDeltaForward() {
			return 0;
		}
        
    };

	public abstract Direction left();
    public abstract Direction right();
    public abstract int xDeltaForward();
    public abstract int yDeltaForward();
    
}
