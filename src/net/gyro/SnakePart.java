package net.gyro;

public class SnakePart {
    public SnakePart root = this;
    public SnakePart parent;
    public SnakePart child;
    public Position pos;

    SnakePart(SnakePart _parent) {
        if (_parent == null) return;
        this.parent = _parent;
        this.pos = _parent.pos;
        this.root = _parent.root;

    }

    public void extend() {
        SnakePart _current = this;
        while (child != null) {
            _current = _current.child;
        }

        _current.child = new SnakePart(_current);
    }
}
