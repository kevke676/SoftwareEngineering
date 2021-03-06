package edu.hr.infdev024;

/*
  Describes a class controlling the update and
  draw behavior all GUI elements
 */
public class GUIManager implements IUpdatable, IDrawable {

    public ListIterator<GUIElement> elements;

    @Override
    public void draw(IDrawVisitor visitor) {
        visitor.drawGUI(this);
    }

    @Override
    public void update(IUpdateVisitor visitor, Float dt) {
        visitor.updateGUI(this, dt);
    }
}
