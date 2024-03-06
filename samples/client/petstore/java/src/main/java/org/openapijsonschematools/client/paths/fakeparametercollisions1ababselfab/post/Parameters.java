package org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post;

import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter0;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter1;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter2;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter3;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter4;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter5;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter6;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter7;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter8;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter9;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter10;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter11;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter12;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter13;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter14;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter15;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter16;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter17;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.parameters.Parameter18;
import org.openapijsonschematools.client.parameter.PathSerializer;
import org.openapijsonschematools.client.parameter.HeadersSerializer;
import org.openapijsonschematools.client.parameter.QuerySerializer;
import org.openapijsonschematools.client.parameter.CookieSerializer;

import org.openapijsonschematools.client.parameter.Parameter;

import java.util.Map;
import java.util.AbstractMap;

public class Parameters {

    public static class PathParametersSerializer extends PathSerializer {
        public PathParametersSerializer() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("1", new Parameter9.Parameter91()),
                    new AbstractMap.SimpleEntry<>("aB", new Parameter10.Parameter101()),
                    new AbstractMap.SimpleEntry<>("Ab", new Parameter11.Parameter111()),
                    new AbstractMap.SimpleEntry<>("self", new Parameter12.Parameter121()),
                    new AbstractMap.SimpleEntry<>("A-B", new Parameter13.Parameter131())
                )
            );
        }
    }

    public static class QueryParametersSerializer extends QuerySerializer {
        public QueryParametersSerializer() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("1", new Parameter0.Parameter01()),
                    new AbstractMap.SimpleEntry<>("aB", new Parameter1.Parameter11()),
                    new AbstractMap.SimpleEntry<>("Ab", new Parameter2.Parameter21()),
                    new AbstractMap.SimpleEntry<>("self", new Parameter3.Parameter31()),
                    new AbstractMap.SimpleEntry<>("A-B", new Parameter4.Parameter41())
                )
            );
        }
    }

    public static class HeaderParametersSerializer extends HeadersSerializer {
        public HeaderParametersSerializer() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("1", new Parameter5.Parameter51()),
                    new AbstractMap.SimpleEntry<>("aB", new Parameter6.Parameter61()),
                    new AbstractMap.SimpleEntry<>("self", new Parameter7.Parameter71()),
                    new AbstractMap.SimpleEntry<>("A-B", new Parameter8.Parameter81())
                )
            );
        }
    }

    public static class CookieParametersSerializer extends CookieSerializer {
        public CookieParametersSerializer() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("1", new Parameter14.Parameter141()),
                    new AbstractMap.SimpleEntry<>("aB", new Parameter15.Parameter151()),
                    new AbstractMap.SimpleEntry<>("Ab", new Parameter16.Parameter161()),
                    new AbstractMap.SimpleEntry<>("self", new Parameter17.Parameter171()),
                    new AbstractMap.SimpleEntry<>("A-B", new Parameter18.Parameter181())
                )
            );
        }
    }
}
