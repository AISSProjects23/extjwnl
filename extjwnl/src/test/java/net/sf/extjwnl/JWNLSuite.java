package net.sf.extjwnl;

import net.sf.extjwnl.data.*;
import net.sf.extjwnl.dictionary.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * All tests.
 *
 * @author Aliaksandr Autayeu <avtaev@gmail.com>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestWord.class,
        TestSynset.class,
        TestExc.class,
        TestSummary.class,
        TestFileBackedDictionary.class,
        TestMapBackedDictionary.class,
        TestDatabaseBackedDictionary.class,
        TestCreateFileBackedDictionary.class,
        TestCreateMapBackedDictionary.class,
        TestFileBackedDictionaryEdit.class,
        TestThreads.class
})
public class JWNLSuite {

    public static void main(String[] args) {
        Class[] classes = new Class[]{
                TestWord.class,
                TestSynset.class,
                TestExc.class,
                TestSummary.class,
                TestFileBackedDictionary.class,
                TestMapBackedDictionary.class,
                TestDatabaseBackedDictionary.class,
                TestCreateFileBackedDictionary.class,
                TestCreateMapBackedDictionary.class,
                TestFileBackedDictionaryEdit.class,
                TestThreads.class
        };
        String[] names = new String[classes.length];
        for (int i = 0; i < classes.length; i++) {
            names[i] = classes[i].getName();
        }
        org.junit.runner.JUnitCore.main(names);
    }
}