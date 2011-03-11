package org.eaves.robot;

public enum Direction {
    
    NORTH {
        @Override 
        public Direction left() {
            return WEST;
        }

        @Override
        public Direction right() {
            return null;
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
        
    };

    public abstract Direction left();
    public abstract Direction right();
}
