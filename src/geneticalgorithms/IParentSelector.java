/*
 * Part of Fresco software under GPL licence
 * http://www.gnu.org/licenses/gpl-3.0.txt
 */
package geneticalgorithms;

/**
 * @author gimli
 * @version Oct 16, 2011
 */
public interface IParentSelector<T> {

	public T selectFather(T[] population);

	public T selectMother(T[] population, T father);
}
