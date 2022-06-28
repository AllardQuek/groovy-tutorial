package templates

import groovy.text.Template
import groovy.text.markup.MarkupTemplateEngine
import groovy.text.markup.TemplateConfiguration


TemplateConfiguration config = new TemplateConfiguration()
MarkupTemplateEngine engine = new MarkupTemplateEngine(config)
Template template = engine.createTemplate("p('test template')")
Map<String, Object> model = new HashMap<>()
Writable output = template.make(model)
print output
// output.writeTo(writer);

