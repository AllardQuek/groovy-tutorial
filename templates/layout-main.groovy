// * Not working
package templates

model = new HashMap<String,Object>();
model.put('title','Title from main model');

layout 'layout-main.tpl', true,
        title: 'overridden title',
        bodyContents: contents { p('This is the body') }
